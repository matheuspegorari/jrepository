package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class OndaSeparacao extends AbstractSankhyaEntity<OndaSeparacao> {
   private BigDecimal codOnda;
   private BigDecimal codUsu;
   private Timestamp dhAlter;

   public BigDecimal getCodOnda() {
        return codOnda;
   }

   public void setCodOnda(BigDecimal codOnda) {
        markAsChanged("CODONDA", codOnda);
        this.codOnda = codOnda;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   @Override
   public String getTableName() {
        return "TGWOND";
   }

   @Override
   public String getEntityName() {
        return "OndaSeparacao";
   }

   @Override
   public OndaSeparacao fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codOnda = vo.asBigDecimal("CODONDA");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        return this;
   }
}

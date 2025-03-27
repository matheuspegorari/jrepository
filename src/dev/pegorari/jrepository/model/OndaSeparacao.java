package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class OndaSeparacao extends AbstractSankhyaEntity<OndaSeparacao> {
   public BigDecimal getCodOnda() {
        return this.getVo().asBigDecimal("CODONDA");
   }

   public void setCodOnda(BigDecimal codOnda) {
        markAsChanged("CODONDA", codOnda);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
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
        this.setVo(vo);
        return this;
   }
}

package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TransferenciaVerbaOrcamento extends AbstractSankhyaEntity<TransferenciaVerbaOrcamento> {
   public BigDecimal getCodMeta() {
        return this.getVo().asBigDecimal("CODMETA");
   }

   public void setCodMeta(BigDecimal codMeta) {
        markAsChanged("CODMETA", codMeta);
   }

   public Timestamp getDhTransf() {
        return this.getVo().asTimestamp("DHTRANSF");
   }

   public void setDhTransf(Timestamp dhTransf) {
        markAsChanged("DHTRANSF", dhTransf);
   }

   public BigDecimal getNuTvo() {
        return this.getVo().asBigDecimal("NUTVO");
   }

   public void setNuTvo(BigDecimal nuTvo) {
        markAsChanged("NUTVO", nuTvo);
   }

   public BigDecimal getVlrTransf() {
        return this.getVo().asBigDecimal("VLRTRANSF");
   }

   public void setVlrTransf(BigDecimal vlrTransf) {
        markAsChanged("VLRTRANSF", vlrTransf);
   }

   @Override
   public String getTableName() {
        return "TGMTVO";
   }

   @Override
   public String getEntityName() {
        return "TransferenciaVerbaOrcamento";
   }

   @Override
   public TransferenciaVerbaOrcamento fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}

package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TransferenciaVerbaOrcamento extends AbstractSankhyaEntity<TransferenciaVerbaOrcamento> {
   private BigDecimal codMeta;
   private Timestamp dhTransf;
   private BigDecimal nuTvo;
   private BigDecimal vlrTransf;

   public BigDecimal getCodMeta() {
        return codMeta;
   }

   public void setCodMeta(BigDecimal codMeta) {
        this.codMeta = codMeta;
   }

   public Timestamp getDhTransf() {
        return dhTransf;
   }

   public void setDhTransf(Timestamp dhTransf) {
        this.dhTransf = dhTransf;
   }

   public BigDecimal getNuTvo() {
        return nuTvo;
   }

   public void setNuTvo(BigDecimal nuTvo) {
        this.nuTvo = nuTvo;
   }

   public BigDecimal getVlrTransf() {
        return vlrTransf;
   }

   public void setVlrTransf(BigDecimal vlrTransf) {
        this.vlrTransf = vlrTransf;
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
        this.codMeta = vo.asBigDecimal("CODMETA");
        this.dhTransf = vo.asTimestamp("DHTRANSF");
        this.nuTvo = vo.asBigDecimal("NUTVO");
        this.vlrTransf = vo.asBigDecimal("VLRTRANSF");
        return this;
   }
}

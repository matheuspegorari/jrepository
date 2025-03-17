package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class NotasPendentesLote extends AbstractSankhyaEntity<NotasPendentesLote> {
   private Timestamp dhInclusao;
   private Timestamp dhUltTenta;
   private BigDecimal nuNota;
   private BigDecimal qtdeEnvio;

   public Timestamp getDhInclusao() {
        return dhInclusao;
   }

   public void setDhInclusao(Timestamp dhInclusao) {
        this.dhInclusao = dhInclusao;
   }

   public Timestamp getDhUltTenta() {
        return dhUltTenta;
   }

   public void setDhUltTenta(Timestamp dhUltTenta) {
        this.dhUltTenta = dhUltTenta;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getQtdeEnvio() {
        return qtdeEnvio;
   }

   public void setQtdeEnvio(BigDecimal qtdeEnvio) {
        this.qtdeEnvio = qtdeEnvio;
   }

   @Override
   public String getTableName() {
        return "TGFNPG";
   }

   @Override
   public String getEntityName() {
        return "NotasPendentesLote";
   }

   @Override
   public NotasPendentesLote fromVO(DynamicVO vo) {
        this.dhInclusao = vo.asTimestamp("DHINCLUSAO");
        this.dhUltTenta = vo.asTimestamp("DHULTTENTA");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.qtdeEnvio = vo.asBigDecimal("QTDENVIO");
        return this;
   }
}

package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class NotasPendentesLote extends AbstractSankhyaEntity<NotasPendentesLote> {
   public Timestamp getDhInclusao() {
        return this.getVo().asTimestamp("DHINCLUSAO");
   }

   public void setDhInclusao(Timestamp dhInclusao) {
        markAsChanged("DHINCLUSAO", dhInclusao);
   }

   public Timestamp getDhUltTenta() {
        return this.getVo().asTimestamp("DHULTTENTA");
   }

   public void setDhUltTenta(Timestamp dhUltTenta) {
        markAsChanged("DHULTTENTA", dhUltTenta);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getQtdeEnvio() {
        return this.getVo().asBigDecimal("QTDENVIO");
   }

   public void setQtdeEnvio(BigDecimal qtdeEnvio) {
        markAsChanged("QTDENVIO", qtdeEnvio);
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
        this.setVo(vo);
        return this;
   }
}

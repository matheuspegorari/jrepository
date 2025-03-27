package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class NotaPendenteAutorizacao extends AbstractSankhyaEntity<NotaPendenteAutorizacao> {
   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public Timestamp getDhUltTenta() {
        return this.getVo().asTimestamp("DHULTTENTA");
   }

   public void setDhUltTenta(Timestamp dhUltTenta) {
        markAsChanged("DHULTTENTA", dhUltTenta);
   }

   public BigDecimal getQtdenvio() {
        return this.getVo().asBigDecimal("QTDENVIO");
   }

   public void setQtdenvio(BigDecimal qtdenvio) {
        markAsChanged("QTDENVIO", qtdenvio);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public Timestamp getDhInclusao() {
        return this.getVo().asTimestamp("DHINCLUSAO");
   }

   public void setDhInclusao(Timestamp dhInclusao) {
        markAsChanged("DHINCLUSAO", dhInclusao);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public String getCompensar() {
        return this.getVo().asString("COMPENSAR");
   }

   public void setCompensar(String compensar) {
        markAsChanged("COMPENSAR", compensar);
   }

   @Override
   public String getTableName() {
        return "TGFNPA";
   }

   @Override
   public String getEntityName() {
        return "NotaPendenteAutorizacao";
   }

   @Override
   public NotaPendenteAutorizacao fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}

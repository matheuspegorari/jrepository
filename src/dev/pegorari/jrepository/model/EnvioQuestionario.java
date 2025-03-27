package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EnvioQuestionario extends AbstractSankhyaEntity<EnvioQuestionario> {
   public BigDecimal getChave() {
        return this.getVo().asBigDecimal("CHAVE");
   }

   public void setChave(BigDecimal chave) {
        markAsChanged("CHAVE", chave);
   }

   public BigDecimal getChave2() {
        return this.getVo().asBigDecimal("CHAVE2");
   }

   public void setChave2(BigDecimal chave2) {
        markAsChanged("CHAVE2", chave2);
   }

   public BigDecimal getCodFila() {
        return this.getVo().asBigDecimal("CODFILA");
   }

   public void setCodFila(BigDecimal codFila) {
        markAsChanged("CODFILA", codFila);
   }

   public Timestamp getDhUltEnvio() {
        return this.getVo().asTimestamp("DHULTENVIO");
   }

   public void setDhUltEnvio(Timestamp dhUltEnvio) {
        markAsChanged("DHULTENVIO", dhUltEnvio);
   }

   public String getEmail() {
        return this.getVo().asString("EMAIL");
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
   }

   public BigDecimal getNuInstancia() {
        return this.getVo().asBigDecimal("NUINSTANCIA");
   }

   public void setNuInstancia(BigDecimal nuInstancia) {
        markAsChanged("NUINSTANCIA", nuInstancia);
   }

   public BigDecimal getNuPla() {
        return this.getVo().asBigDecimal("NUPLA");
   }

   public void setNuPla(BigDecimal nuPla) {
        markAsChanged("NUPLA", nuPla);
   }

   public BigDecimal getQtdEnvio() {
        return this.getVo().asBigDecimal("QTDENVIO");
   }

   public void setQtdEnvio(BigDecimal qtdEnvio) {
        markAsChanged("QTDENVIO", qtdEnvio);
   }

   public String getRespondido() {
        return this.getVo().asString("RESPONDIDO");
   }

   public void setRespondido(String respondido) {
        markAsChanged("RESPONDIDO", respondido);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   @Override
   public String getTableName() {
        return "TPQENV";
   }

   @Override
   public String getEntityName() {
        return "EnvioQuestionario";
   }

   @Override
   public EnvioQuestionario fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}

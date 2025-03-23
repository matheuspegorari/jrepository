package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EnvioQuestionario extends AbstractSankhyaEntity<EnvioQuestionario> {
   private BigDecimal chave;
   private BigDecimal chave2;
   private BigDecimal codFila;
   private Timestamp dhUltEnvio;
   private String email;
   private BigDecimal nuInstancia;
   private BigDecimal nuPla;
   private BigDecimal qtdEnvio;
   private String respondido;
   private BigDecimal sequencia;

   public BigDecimal getChave() {
        return chave;
   }

   public void setChave(BigDecimal chave) {
        markAsChanged("CHAVE", chave);
        this.chave = chave;
   }

   public BigDecimal getChave2() {
        return chave2;
   }

   public void setChave2(BigDecimal chave2) {
        markAsChanged("CHAVE2", chave2);
        this.chave2 = chave2;
   }

   public BigDecimal getCodFila() {
        return codFila;
   }

   public void setCodFila(BigDecimal codFila) {
        markAsChanged("CODFILA", codFila);
        this.codFila = codFila;
   }

   public Timestamp getDhUltEnvio() {
        return dhUltEnvio;
   }

   public void setDhUltEnvio(Timestamp dhUltEnvio) {
        markAsChanged("DHULTENVIO", dhUltEnvio);
        this.dhUltEnvio = dhUltEnvio;
   }

   public String getEmail() {
        return email;
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
        this.email = email;
   }

   public BigDecimal getNuInstancia() {
        return nuInstancia;
   }

   public void setNuInstancia(BigDecimal nuInstancia) {
        markAsChanged("NUINSTANCIA", nuInstancia);
        this.nuInstancia = nuInstancia;
   }

   public BigDecimal getNuPla() {
        return nuPla;
   }

   public void setNuPla(BigDecimal nuPla) {
        markAsChanged("NUPLA", nuPla);
        this.nuPla = nuPla;
   }

   public BigDecimal getQtdEnvio() {
        return qtdEnvio;
   }

   public void setQtdEnvio(BigDecimal qtdEnvio) {
        markAsChanged("QTDENVIO", qtdEnvio);
        this.qtdEnvio = qtdEnvio;
   }

   public String getRespondido() {
        return respondido;
   }

   public void setRespondido(String respondido) {
        markAsChanged("RESPONDIDO", respondido);
        this.respondido = respondido;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
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
        this.chave = vo.asBigDecimal("CHAVE");
        this.chave2 = vo.asBigDecimal("CHAVE2");
        this.codFila = vo.asBigDecimal("CODFILA");
        this.dhUltEnvio = vo.asTimestamp("DHULTENVIO");
        this.email = vo.asString("EMAIL");
        this.nuInstancia = vo.asBigDecimal("NUINSTANCIA");
        this.nuPla = vo.asBigDecimal("NUPLA");
        this.qtdEnvio = vo.asBigDecimal("QTDENVIO");
        this.respondido = vo.asString("RESPONDIDO");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        return this;
   }
}

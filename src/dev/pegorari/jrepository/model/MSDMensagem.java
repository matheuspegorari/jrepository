package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MSDMensagem implements SankhyaEntity<MSDMensagem> {

   private BigDecimal intMin;
   private char[] mensagem;
   private Timestamp proxResol;
   private BigDecimal tentativas;
   private String tipoConteudo;
   private Timestamp ultResol;
   private String assunto;
   private String ativa;
   private String cfgDtResol;
   private BigDecimal codMsg;
   private BigDecimal codUsu;
   private char[] condicao;
   private Timestamp dtAlter;
   private String indicacao;
   private BigDecimal codSmtp;

   public BigDecimal getIntMin() {
        return intMin;
   }

   public void setIntMin(BigDecimal intMin) {
        this.intMin = intMin;
   }

   public char[] getMensagem() {
        return mensagem;
   }

   public void setMensagem(char[] mensagem) {
        this.mensagem = mensagem;
   }

   public Timestamp getProxResol() {
        return proxResol;
   }

   public void setProxResol(Timestamp proxResol) {
        this.proxResol = proxResol;
   }

   public BigDecimal getTentativas() {
        return tentativas;
   }

   public void setTentativas(BigDecimal tentativas) {
        this.tentativas = tentativas;
   }

   public String getTipoConteudo() {
        return tipoConteudo;
   }

   public void setTipoConteudo(String tipoConteudo) {
        this.tipoConteudo = tipoConteudo;
   }

   public Timestamp getUltResol() {
        return ultResol;
   }

   public void setUltResol(Timestamp ultResol) {
        this.ultResol = ultResol;
   }

   public String getAssunto() {
        return assunto;
   }

   public void setAssunto(String assunto) {
        this.assunto = assunto;
   }

   public String getAtiva() {
        return ativa;
   }

   public void setAtiva(String ativa) {
        this.ativa = ativa;
   }

   public String getCfgDtResol() {
        return cfgDtResol;
   }

   public void setCfgDtResol(String cfgDtResol) {
        this.cfgDtResol = cfgDtResol;
   }

   public BigDecimal getCodMsg() {
        return codMsg;
   }

   public void setCodMsg(BigDecimal codMsg) {
        this.codMsg = codMsg;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public char[] getCondicao() {
        return condicao;
   }

   public void setCondicao(char[] condicao) {
        this.condicao = condicao;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public String getIndicacao() {
        return indicacao;
   }

   public void setIndicacao(String indicacao) {
        this.indicacao = indicacao;
   }

   public BigDecimal getCodSmtp() {
        return codSmtp;
   }

   public void setCodSmtp(BigDecimal codSmtp) {
        this.codSmtp = codSmtp;
   }

   @Override
   public String getEntityName() {
        return "MSDMensagem";
   }

   @Override
   public MSDMensagem fromVO(DynamicVO vo) {
        this.intMin = vo.asBigDecimal("INTMIN");
        this.mensagem = vo.asClob("MENSAGEM");
        this.proxResol = vo.asTimestamp("PROXRESOL");
        this.tentativas = vo.asBigDecimal("TENTATIVAS");
        this.tipoConteudo = vo.asString("TIPOCONTEUDO");
        this.ultResol = vo.asTimestamp("ULTRESOL");
        this.assunto = vo.asString("ASSUNTO");
        this.ativa = vo.asString("ATIVA");
        this.cfgDtResol = vo.asString("CFGDTRESOL");
        this.codMsg = vo.asBigDecimal("CODMSG");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.condicao = vo.asClob("CONDICAO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.indicacao = vo.asString("INDICACAO");
        this.codSmtp = vo.asBigDecimal("CODSMTP");
        return this;
   }
}

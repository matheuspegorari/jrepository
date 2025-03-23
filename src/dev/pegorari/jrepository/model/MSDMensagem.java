package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MSDMensagem extends AbstractSankhyaEntity<MSDMensagem> {
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
        markAsChanged("INTMIN", intMin);
        this.intMin = intMin;
   }

   public char[] getMensagem() {
        return mensagem;
   }

   public void setMensagem(char[] mensagem) {
        markAsChanged("MENSAGEM", mensagem);
        this.mensagem = mensagem;
   }

   public Timestamp getProxResol() {
        return proxResol;
   }

   public void setProxResol(Timestamp proxResol) {
        markAsChanged("PROXRESOL", proxResol);
        this.proxResol = proxResol;
   }

   public BigDecimal getTentativas() {
        return tentativas;
   }

   public void setTentativas(BigDecimal tentativas) {
        markAsChanged("TENTATIVAS", tentativas);
        this.tentativas = tentativas;
   }

   public String getTipoConteudo() {
        return tipoConteudo;
   }

   public void setTipoConteudo(String tipoConteudo) {
        markAsChanged("TIPOCONTEUDO", tipoConteudo);
        this.tipoConteudo = tipoConteudo;
   }

   public Timestamp getUltResol() {
        return ultResol;
   }

   public void setUltResol(Timestamp ultResol) {
        markAsChanged("ULTRESOL", ultResol);
        this.ultResol = ultResol;
   }

   public String getAssunto() {
        return assunto;
   }

   public void setAssunto(String assunto) {
        markAsChanged("ASSUNTO", assunto);
        this.assunto = assunto;
   }

   public String getAtiva() {
        return ativa;
   }

   public void setAtiva(String ativa) {
        markAsChanged("ATIVA", ativa);
        this.ativa = ativa;
   }

   public String getCfgDtResol() {
        return cfgDtResol;
   }

   public void setCfgDtResol(String cfgDtResol) {
        markAsChanged("CFGDTRESOL", cfgDtResol);
        this.cfgDtResol = cfgDtResol;
   }

   public BigDecimal getCodMsg() {
        return codMsg;
   }

   public void setCodMsg(BigDecimal codMsg) {
        markAsChanged("CODMSG", codMsg);
        this.codMsg = codMsg;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public char[] getCondicao() {
        return condicao;
   }

   public void setCondicao(char[] condicao) {
        markAsChanged("CONDICAO", condicao);
        this.condicao = condicao;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public String getIndicacao() {
        return indicacao;
   }

   public void setIndicacao(String indicacao) {
        markAsChanged("INDICACAO", indicacao);
        this.indicacao = indicacao;
   }

   public BigDecimal getCodSmtp() {
        return codSmtp;
   }

   public void setCodSmtp(BigDecimal codSmtp) {
        markAsChanged("CODSMTP", codSmtp);
        this.codSmtp = codSmtp;
   }

   @Override
   public String getTableName() {
        return "TMDMSG";
   }

   @Override
   public String getEntityName() {
        return "MSDMensagem";
   }

   @Override
   public MSDMensagem fromVO(DynamicVO vo) {
        this.setVo(vo);
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

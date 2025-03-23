package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class AcaoAgendada extends AbstractSankhyaEntity<AcaoAgendada> {
   private BigDecimal nuAag;
   private String autoTran;
   private BigDecimal codModulo;
   private String ativo;
   private String acao;
   private String nome;
   private String fonteDados;
   private String tipoGatilho;
   private String tipoAcao;
   private String descricao;
   private BigDecimal codUsuLogin;
   private String expGatilho;

   public BigDecimal getNuAag() {
        return nuAag;
   }

   public void setNuAag(BigDecimal nuAag) {
        markAsChanged("NUAAG", nuAag);
        this.nuAag = nuAag;
   }

   public String getAutoTran() {
        return autoTran;
   }

   public void setAutoTran(String autoTran) {
        markAsChanged("AUTOTRAN", autoTran);
        this.autoTran = autoTran;
   }

   public BigDecimal getCodModulo() {
        return codModulo;
   }

   public void setCodModulo(BigDecimal codModulo) {
        markAsChanged("CODMODULO", codModulo);
        this.codModulo = codModulo;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public String getAcao() {
        return acao;
   }

   public void setAcao(String acao) {
        markAsChanged("ACAO", acao);
        this.acao = acao;
   }

   public String getNome() {
        return nome;
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
        this.nome = nome;
   }

   public String getFonteDados() {
        return fonteDados;
   }

   public void setFonteDados(String fonteDados) {
        markAsChanged("FONTEDADOS", fonteDados);
        this.fonteDados = fonteDados;
   }

   public String getTipoGatilho() {
        return tipoGatilho;
   }

   public void setTipoGatilho(String tipoGatilho) {
        markAsChanged("TIPOGATILHO", tipoGatilho);
        this.tipoGatilho = tipoGatilho;
   }

   public String getTipoAcao() {
        return tipoAcao;
   }

   public void setTipoAcao(String tipoAcao) {
        markAsChanged("TIPOACAO", tipoAcao);
        this.tipoAcao = tipoAcao;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public BigDecimal getCodUsuLogin() {
        return codUsuLogin;
   }

   public void setCodUsuLogin(BigDecimal codUsuLogin) {
        markAsChanged("CODUSULOGIN", codUsuLogin);
        this.codUsuLogin = codUsuLogin;
   }

   public String getExpGatilho() {
        return expGatilho;
   }

   public void setExpGatilho(String expGatilho) {
        markAsChanged("EXPGATILHO", expGatilho);
        this.expGatilho = expGatilho;
   }

   @Override
   public String getTableName() {
        return "TSIAAG";
   }

   @Override
   public String getEntityName() {
        return "AcaoAgendada";
   }

   @Override
   public AcaoAgendada fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.nuAag = vo.asBigDecimal("NUAAG");
        this.autoTran = vo.asString("AUTOTRAN");
        this.codModulo = vo.asBigDecimal("CODMODULO");
        this.ativo = vo.asString("ATIVO");
        this.acao = vo.asString("ACAO");
        this.nome = vo.asString("NOME");
        this.fonteDados = vo.asString("FONTEDADOS");
        this.tipoGatilho = vo.asString("TIPOGATILHO");
        this.tipoAcao = vo.asString("TIPOACAO");
        this.descricao = vo.asString("DESCRICAO");
        this.codUsuLogin = vo.asBigDecimal("CODUSULOGIN");
        this.expGatilho = vo.asString("EXPGATILHO");
        return this;
   }
}

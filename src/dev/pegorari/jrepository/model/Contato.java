package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Contato extends AbstractSankhyaEntity<Contato> {
   private String email;
   private String fax;
   private String latitude;
   private String longitude;
   private BigDecimal nivelCob;
   private String nomeContato;
   private String numEnd;
   private String possuiAcessoBt;
   private BigDecimal prioridade;
   private BigDecimal ramal;
   private String recebeBoletoEmail;
   private String recebeNotaEmail;
   private String recEmailImpPed;
   private String senhaAcesso;
   private String socio;
   private String telefone;
   private String telResid;
   private String tipPessoa;
   private String apelido;
   private String ativo;
   private String cargo;
   private String celular;
   private String cep;
   private String cnpj;
   private BigDecimal codBai;
   private BigDecimal codCid;
   private BigDecimal codContato;
   private BigDecimal codEnd;
   private BigDecimal codParc;
   private BigDecimal codUsu;
   private String complemento;
   private String cpf;
   private Timestamp dtCad;
   private Timestamp dtNasc;
   private BigDecimal qtdEntregaCestas;
   private String habPlanEntCestas;
   private BigDecimal codReg;
   private String inscEstad;
   private String respCobranca;
   private String timAgencia;
   private BigDecimal timBanco;
   private String timBeneficiario;
   private String timConta;
   private BigDecimal timNacionalidad;
   private BigDecimal timProcurador;
   private BigDecimal timProfissao;
   private String timRepresentante;
   private String timRg;
   private BigDecimal timTipo;
   private String enviaNotifCota;
   private BigDecimal codUsuAlt;
   private Timestamp dhAlter;

   public String getEmail() {
        return email;
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
        this.email = email;
   }

   public String getFax() {
        return fax;
   }

   public void setFax(String fax) {
        markAsChanged("FAX", fax);
        this.fax = fax;
   }

   public String getLatitude() {
        return latitude;
   }

   public void setLatitude(String latitude) {
        markAsChanged("LATITUDE", latitude);
        this.latitude = latitude;
   }

   public String getLongitude() {
        return longitude;
   }

   public void setLongitude(String longitude) {
        markAsChanged("LONGITUDE", longitude);
        this.longitude = longitude;
   }

   public BigDecimal getNivelCob() {
        return nivelCob;
   }

   public void setNivelCob(BigDecimal nivelCob) {
        markAsChanged("NIVELCOB", nivelCob);
        this.nivelCob = nivelCob;
   }

   public String getNomeContato() {
        return nomeContato;
   }

   public void setNomeContato(String nomeContato) {
        markAsChanged("NOMECONTATO", nomeContato);
        this.nomeContato = nomeContato;
   }

   public String getNumEnd() {
        return numEnd;
   }

   public void setNumEnd(String numEnd) {
        markAsChanged("NUMEND", numEnd);
        this.numEnd = numEnd;
   }

   public String getPossuiAcessoBt() {
        return possuiAcessoBt;
   }

   public void setPossuiAcessoBt(String possuiAcessoBt) {
        markAsChanged("POSSUIACESSOBT", possuiAcessoBt);
        this.possuiAcessoBt = possuiAcessoBt;
   }

   public BigDecimal getPrioridade() {
        return prioridade;
   }

   public void setPrioridade(BigDecimal prioridade) {
        markAsChanged("PRIORIDADE", prioridade);
        this.prioridade = prioridade;
   }

   public BigDecimal getRamal() {
        return ramal;
   }

   public void setRamal(BigDecimal ramal) {
        markAsChanged("RAMAL", ramal);
        this.ramal = ramal;
   }

   public String getRecebeBoletoEmail() {
        return recebeBoletoEmail;
   }

   public void setRecebeBoletoEmail(String recebeBoletoEmail) {
        markAsChanged("RECEBEBOLETOEMAIL", recebeBoletoEmail);
        this.recebeBoletoEmail = recebeBoletoEmail;
   }

   public String getRecebeNotaEmail() {
        return recebeNotaEmail;
   }

   public void setRecebeNotaEmail(String recebeNotaEmail) {
        markAsChanged("RECEBENOTAEMAIL", recebeNotaEmail);
        this.recebeNotaEmail = recebeNotaEmail;
   }

   public String getRecEmailImpPed() {
        return recEmailImpPed;
   }

   public void setRecEmailImpPed(String recEmailImpPed) {
        markAsChanged("RECEMAILIMPPED", recEmailImpPed);
        this.recEmailImpPed = recEmailImpPed;
   }

   public String getSenhaAcesso() {
        return senhaAcesso;
   }

   public void setSenhaAcesso(String senhaAcesso) {
        markAsChanged("SENHAACESSO", senhaAcesso);
        this.senhaAcesso = senhaAcesso;
   }

   public String getSocio() {
        return socio;
   }

   public void setSocio(String socio) {
        markAsChanged("SOCIO", socio);
        this.socio = socio;
   }

   public String getTelefone() {
        return telefone;
   }

   public void setTelefone(String telefone) {
        markAsChanged("TELEFONE", telefone);
        this.telefone = telefone;
   }

   public String getTelResid() {
        return telResid;
   }

   public void setTelResid(String telResid) {
        markAsChanged("TELRESID", telResid);
        this.telResid = telResid;
   }

   public String getTipPessoa() {
        return tipPessoa;
   }

   public void setTipPessoa(String tipPessoa) {
        markAsChanged("TIPPESSOA", tipPessoa);
        this.tipPessoa = tipPessoa;
   }

   public String getApelido() {
        return apelido;
   }

   public void setApelido(String apelido) {
        markAsChanged("APELIDO", apelido);
        this.apelido = apelido;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public String getCargo() {
        return cargo;
   }

   public void setCargo(String cargo) {
        markAsChanged("CARGO", cargo);
        this.cargo = cargo;
   }

   public String getCelular() {
        return celular;
   }

   public void setCelular(String celular) {
        markAsChanged("CELULAR", celular);
        this.celular = celular;
   }

   public String getCep() {
        return cep;
   }

   public void setCep(String cep) {
        markAsChanged("CEP", cep);
        this.cep = cep;
   }

   public String getCnpj() {
        return cnpj;
   }

   public void setCnpj(String cnpj) {
        markAsChanged("CNPJ", cnpj);
        this.cnpj = cnpj;
   }

   public BigDecimal getCodBai() {
        return codBai;
   }

   public void setCodBai(BigDecimal codBai) {
        markAsChanged("CODBAI", codBai);
        this.codBai = codBai;
   }

   public BigDecimal getCodCid() {
        return codCid;
   }

   public void setCodCid(BigDecimal codCid) {
        markAsChanged("CODCID", codCid);
        this.codCid = codCid;
   }

   public BigDecimal getCodContato() {
        return codContato;
   }

   public void setCodContato(BigDecimal codContato) {
        markAsChanged("CODCONTATO", codContato);
        this.codContato = codContato;
   }

   public BigDecimal getCodEnd() {
        return codEnd;
   }

   public void setCodEnd(BigDecimal codEnd) {
        markAsChanged("CODEND", codEnd);
        this.codEnd = codEnd;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getComplemento() {
        return complemento;
   }

   public void setComplemento(String complemento) {
        markAsChanged("COMPLEMENTO", complemento);
        this.complemento = complemento;
   }

   public String getCpf() {
        return cpf;
   }

   public void setCpf(String cpf) {
        markAsChanged("CPF", cpf);
        this.cpf = cpf;
   }

   public Timestamp getDtCad() {
        return dtCad;
   }

   public void setDtCad(Timestamp dtCad) {
        markAsChanged("DTCAD", dtCad);
        this.dtCad = dtCad;
   }

   public Timestamp getDtNasc() {
        return dtNasc;
   }

   public void setDtNasc(Timestamp dtNasc) {
        markAsChanged("DTNASC", dtNasc);
        this.dtNasc = dtNasc;
   }

   public BigDecimal getQtdEntregaCestas() {
        return qtdEntregaCestas;
   }

   public void setQtdEntregaCestas(BigDecimal qtdEntregaCestas) {
        markAsChanged("QTDENTREGACESTAS", qtdEntregaCestas);
        this.qtdEntregaCestas = qtdEntregaCestas;
   }

   public String getHabPlanEntCestas() {
        return habPlanEntCestas;
   }

   public void setHabPlanEntCestas(String habPlanEntCestas) {
        markAsChanged("HABPLANENTCESTAS", habPlanEntCestas);
        this.habPlanEntCestas = habPlanEntCestas;
   }

   public BigDecimal getCodReg() {
        return codReg;
   }

   public void setCodReg(BigDecimal codReg) {
        markAsChanged("CODREG", codReg);
        this.codReg = codReg;
   }

   public String getInscEstad() {
        return inscEstad;
   }

   public void setInscEstad(String inscEstad) {
        markAsChanged("INSCESTAD", inscEstad);
        this.inscEstad = inscEstad;
   }

   public String getRespCobranca() {
        return respCobranca;
   }

   public void setRespCobranca(String respCobranca) {
        markAsChanged("RESPCOBRANCA", respCobranca);
        this.respCobranca = respCobranca;
   }

   public String getTimAgencia() {
        return timAgencia;
   }

   public void setTimAgencia(String timAgencia) {
        markAsChanged("TIMAGENCIA", timAgencia);
        this.timAgencia = timAgencia;
   }

   public BigDecimal getTimBanco() {
        return timBanco;
   }

   public void setTimBanco(BigDecimal timBanco) {
        markAsChanged("TIMBANCO", timBanco);
        this.timBanco = timBanco;
   }

   public String getTimBeneficiario() {
        return timBeneficiario;
   }

   public void setTimBeneficiario(String timBeneficiario) {
        markAsChanged("TIMBENEFICIARIO", timBeneficiario);
        this.timBeneficiario = timBeneficiario;
   }

   public String getTimConta() {
        return timConta;
   }

   public void setTimConta(String timConta) {
        markAsChanged("TIMCONTA", timConta);
        this.timConta = timConta;
   }

   public BigDecimal getTimNacionalidad() {
        return timNacionalidad;
   }

   public void setTimNacionalidad(BigDecimal timNacionalidad) {
        markAsChanged("TIMNACIONALIDAD", timNacionalidad);
        this.timNacionalidad = timNacionalidad;
   }

   public BigDecimal getTimProcurador() {
        return timProcurador;
   }

   public void setTimProcurador(BigDecimal timProcurador) {
        markAsChanged("TIMPROCURADOR", timProcurador);
        this.timProcurador = timProcurador;
   }

   public BigDecimal getTimProfissao() {
        return timProfissao;
   }

   public void setTimProfissao(BigDecimal timProfissao) {
        markAsChanged("TIMPROFISSAO", timProfissao);
        this.timProfissao = timProfissao;
   }

   public String getTimRepresentante() {
        return timRepresentante;
   }

   public void setTimRepresentante(String timRepresentante) {
        markAsChanged("TIMREPRESENTANTE", timRepresentante);
        this.timRepresentante = timRepresentante;
   }

   public String getTimRg() {
        return timRg;
   }

   public void setTimRg(String timRg) {
        markAsChanged("TIMRG", timRg);
        this.timRg = timRg;
   }

   public BigDecimal getTimTipo() {
        return timTipo;
   }

   public void setTimTipo(BigDecimal timTipo) {
        markAsChanged("TIMTIPO", timTipo);
        this.timTipo = timTipo;
   }

   public String getEnviaNotifCota() {
        return enviaNotifCota;
   }

   public void setEnviaNotifCota(String enviaNotifCota) {
        markAsChanged("ENVIANOTIFCOTA", enviaNotifCota);
        this.enviaNotifCota = enviaNotifCota;
   }

   public BigDecimal getCodUsuAlt() {
        return codUsuAlt;
   }

   public void setCodUsuAlt(BigDecimal codUsuAlt) {
        markAsChanged("CODUSUALT", codUsuAlt);
        this.codUsuAlt = codUsuAlt;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   @Override
   public String getTableName() {
        return "TGFCTT";
   }

   @Override
   public String getEntityName() {
        return "Contato";
   }

   @Override
   public Contato fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.email = vo.asString("EMAIL");
        this.fax = vo.asString("FAX");
        this.latitude = vo.asString("LATITUDE");
        this.longitude = vo.asString("LONGITUDE");
        this.nivelCob = vo.asBigDecimal("NIVELCOB");
        this.nomeContato = vo.asString("NOMECONTATO");
        this.numEnd = vo.asString("NUMEND");
        this.possuiAcessoBt = vo.asString("POSSUIACESSOBT");
        this.prioridade = vo.asBigDecimal("PRIORIDADE");
        this.ramal = vo.asBigDecimal("RAMAL");
        this.recebeBoletoEmail = vo.asString("RECEBEBOLETOEMAIL");
        this.recebeNotaEmail = vo.asString("RECEBENOTAEMAIL");
        this.recEmailImpPed = vo.asString("RECEMAILIMPPED");
        this.senhaAcesso = vo.asString("SENHAACESSO");
        this.socio = vo.asString("SOCIO");
        this.telefone = vo.asString("TELEFONE");
        this.telResid = vo.asString("TELRESID");
        this.tipPessoa = vo.asString("TIPPESSOA");
        this.apelido = vo.asString("APELIDO");
        this.ativo = vo.asString("ATIVO");
        this.cargo = vo.asString("CARGO");
        this.celular = vo.asString("CELULAR");
        this.cep = vo.asString("CEP");
        this.cnpj = vo.asString("CNPJ");
        this.codBai = vo.asBigDecimal("CODBAI");
        this.codCid = vo.asBigDecimal("CODCID");
        this.codContato = vo.asBigDecimal("CODCONTATO");
        this.codEnd = vo.asBigDecimal("CODEND");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.complemento = vo.asString("COMPLEMENTO");
        this.cpf = vo.asString("CPF");
        this.dtCad = vo.asTimestamp("DTCAD");
        this.dtNasc = vo.asTimestamp("DTNASC");
        this.qtdEntregaCestas = vo.asBigDecimal("QTDENTREGACESTAS");
        this.habPlanEntCestas = vo.asString("HABPLANENTCESTAS");
        this.codReg = vo.asBigDecimal("CODREG");
        this.inscEstad = vo.asString("INSCESTAD");
        this.respCobranca = vo.asString("RESPCOBRANCA");
        this.timAgencia = vo.asString("TIMAGENCIA");
        this.timBanco = vo.asBigDecimal("TIMBANCO");
        this.timBeneficiario = vo.asString("TIMBENEFICIARIO");
        this.timConta = vo.asString("TIMCONTA");
        this.timNacionalidad = vo.asBigDecimal("TIMNACIONALIDAD");
        this.timProcurador = vo.asBigDecimal("TIMPROCURADOR");
        this.timProfissao = vo.asBigDecimal("TIMPROFISSAO");
        this.timRepresentante = vo.asString("TIMREPRESENTANTE");
        this.timRg = vo.asString("TIMRG");
        this.timTipo = vo.asBigDecimal("TIMTIPO");
        this.enviaNotifCota = vo.asString("ENVIANOTIFCOTA");
        this.codUsuAlt = vo.asBigDecimal("CODUSUALT");
        this.dhAlter = vo.asTimestamp("DHALTER");
        return this;
   }
}

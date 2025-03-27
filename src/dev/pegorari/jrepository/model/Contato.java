package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Contato extends AbstractSankhyaEntity<Contato> {
   public String getEmail() {
        return this.getVo().asString("EMAIL");
   }

   public void setEmail(String email) {
        markAsChanged("EMAIL", email);
   }

   public String getFax() {
        return this.getVo().asString("FAX");
   }

   public void setFax(String fax) {
        markAsChanged("FAX", fax);
   }

   public String getLatitude() {
        return this.getVo().asString("LATITUDE");
   }

   public void setLatitude(String latitude) {
        markAsChanged("LATITUDE", latitude);
   }

   public String getLongitude() {
        return this.getVo().asString("LONGITUDE");
   }

   public void setLongitude(String longitude) {
        markAsChanged("LONGITUDE", longitude);
   }

   public BigDecimal getNivelCob() {
        return this.getVo().asBigDecimal("NIVELCOB");
   }

   public void setNivelCob(BigDecimal nivelCob) {
        markAsChanged("NIVELCOB", nivelCob);
   }

   public String getNomeContato() {
        return this.getVo().asString("NOMECONTATO");
   }

   public void setNomeContato(String nomeContato) {
        markAsChanged("NOMECONTATO", nomeContato);
   }

   public String getNumEnd() {
        return this.getVo().asString("NUMEND");
   }

   public void setNumEnd(String numEnd) {
        markAsChanged("NUMEND", numEnd);
   }

   public String getPossuiAcessoBt() {
        return this.getVo().asString("POSSUIACESSOBT");
   }

   public void setPossuiAcessoBt(String possuiAcessoBt) {
        markAsChanged("POSSUIACESSOBT", possuiAcessoBt);
   }

   public BigDecimal getPrioridade() {
        return this.getVo().asBigDecimal("PRIORIDADE");
   }

   public void setPrioridade(BigDecimal prioridade) {
        markAsChanged("PRIORIDADE", prioridade);
   }

   public BigDecimal getRamal() {
        return this.getVo().asBigDecimal("RAMAL");
   }

   public void setRamal(BigDecimal ramal) {
        markAsChanged("RAMAL", ramal);
   }

   public String getRecebeBoletoEmail() {
        return this.getVo().asString("RECEBEBOLETOEMAIL");
   }

   public void setRecebeBoletoEmail(String recebeBoletoEmail) {
        markAsChanged("RECEBEBOLETOEMAIL", recebeBoletoEmail);
   }

   public String getRecebeNotaEmail() {
        return this.getVo().asString("RECEBENOTAEMAIL");
   }

   public void setRecebeNotaEmail(String recebeNotaEmail) {
        markAsChanged("RECEBENOTAEMAIL", recebeNotaEmail);
   }

   public String getRecEmailImpPed() {
        return this.getVo().asString("RECEMAILIMPPED");
   }

   public void setRecEmailImpPed(String recEmailImpPed) {
        markAsChanged("RECEMAILIMPPED", recEmailImpPed);
   }

   public String getSenhaAcesso() {
        return this.getVo().asString("SENHAACESSO");
   }

   public void setSenhaAcesso(String senhaAcesso) {
        markAsChanged("SENHAACESSO", senhaAcesso);
   }

   public String getSocio() {
        return this.getVo().asString("SOCIO");
   }

   public void setSocio(String socio) {
        markAsChanged("SOCIO", socio);
   }

   public String getTelefone() {
        return this.getVo().asString("TELEFONE");
   }

   public void setTelefone(String telefone) {
        markAsChanged("TELEFONE", telefone);
   }

   public String getTelResid() {
        return this.getVo().asString("TELRESID");
   }

   public void setTelResid(String telResid) {
        markAsChanged("TELRESID", telResid);
   }

   public String getTipPessoa() {
        return this.getVo().asString("TIPPESSOA");
   }

   public void setTipPessoa(String tipPessoa) {
        markAsChanged("TIPPESSOA", tipPessoa);
   }

   public String getApelido() {
        return this.getVo().asString("APELIDO");
   }

   public void setApelido(String apelido) {
        markAsChanged("APELIDO", apelido);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public String getCargo() {
        return this.getVo().asString("CARGO");
   }

   public void setCargo(String cargo) {
        markAsChanged("CARGO", cargo);
   }

   public String getCelular() {
        return this.getVo().asString("CELULAR");
   }

   public void setCelular(String celular) {
        markAsChanged("CELULAR", celular);
   }

   public String getCep() {
        return this.getVo().asString("CEP");
   }

   public void setCep(String cep) {
        markAsChanged("CEP", cep);
   }

   public String getCnpj() {
        return this.getVo().asString("CNPJ");
   }

   public void setCnpj(String cnpj) {
        markAsChanged("CNPJ", cnpj);
   }

   public BigDecimal getCodBai() {
        return this.getVo().asBigDecimal("CODBAI");
   }

   public void setCodBai(BigDecimal codBai) {
        markAsChanged("CODBAI", codBai);
   }

   public BigDecimal getCodCid() {
        return this.getVo().asBigDecimal("CODCID");
   }

   public void setCodCid(BigDecimal codCid) {
        markAsChanged("CODCID", codCid);
   }

   public BigDecimal getCodContato() {
        return this.getVo().asBigDecimal("CODCONTATO");
   }

   public void setCodContato(BigDecimal codContato) {
        markAsChanged("CODCONTATO", codContato);
   }

   public BigDecimal getCodEnd() {
        return this.getVo().asBigDecimal("CODEND");
   }

   public void setCodEnd(BigDecimal codEnd) {
        markAsChanged("CODEND", codEnd);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public String getComplemento() {
        return this.getVo().asString("COMPLEMENTO");
   }

   public void setComplemento(String complemento) {
        markAsChanged("COMPLEMENTO", complemento);
   }

   public String getCpf() {
        return this.getVo().asString("CPF");
   }

   public void setCpf(String cpf) {
        markAsChanged("CPF", cpf);
   }

   public Timestamp getDtCad() {
        return this.getVo().asTimestamp("DTCAD");
   }

   public void setDtCad(Timestamp dtCad) {
        markAsChanged("DTCAD", dtCad);
   }

   public Timestamp getDtNasc() {
        return this.getVo().asTimestamp("DTNASC");
   }

   public void setDtNasc(Timestamp dtNasc) {
        markAsChanged("DTNASC", dtNasc);
   }

   public BigDecimal getQtdEntregaCestas() {
        return this.getVo().asBigDecimal("QTDENTREGACESTAS");
   }

   public void setQtdEntregaCestas(BigDecimal qtdEntregaCestas) {
        markAsChanged("QTDENTREGACESTAS", qtdEntregaCestas);
   }

   public String getHabPlanEntCestas() {
        return this.getVo().asString("HABPLANENTCESTAS");
   }

   public void setHabPlanEntCestas(String habPlanEntCestas) {
        markAsChanged("HABPLANENTCESTAS", habPlanEntCestas);
   }

   public BigDecimal getCodReg() {
        return this.getVo().asBigDecimal("CODREG");
   }

   public void setCodReg(BigDecimal codReg) {
        markAsChanged("CODREG", codReg);
   }

   public String getInscEstad() {
        return this.getVo().asString("INSCESTAD");
   }

   public void setInscEstad(String inscEstad) {
        markAsChanged("INSCESTAD", inscEstad);
   }

   public String getRespCobranca() {
        return this.getVo().asString("RESPCOBRANCA");
   }

   public void setRespCobranca(String respCobranca) {
        markAsChanged("RESPCOBRANCA", respCobranca);
   }

   public String getTimAgencia() {
        return this.getVo().asString("TIMAGENCIA");
   }

   public void setTimAgencia(String timAgencia) {
        markAsChanged("TIMAGENCIA", timAgencia);
   }

   public BigDecimal getTimBanco() {
        return this.getVo().asBigDecimal("TIMBANCO");
   }

   public void setTimBanco(BigDecimal timBanco) {
        markAsChanged("TIMBANCO", timBanco);
   }

   public String getTimBeneficiario() {
        return this.getVo().asString("TIMBENEFICIARIO");
   }

   public void setTimBeneficiario(String timBeneficiario) {
        markAsChanged("TIMBENEFICIARIO", timBeneficiario);
   }

   public String getTimConta() {
        return this.getVo().asString("TIMCONTA");
   }

   public void setTimConta(String timConta) {
        markAsChanged("TIMCONTA", timConta);
   }

   public BigDecimal getTimNacionalidad() {
        return this.getVo().asBigDecimal("TIMNACIONALIDAD");
   }

   public void setTimNacionalidad(BigDecimal timNacionalidad) {
        markAsChanged("TIMNACIONALIDAD", timNacionalidad);
   }

   public BigDecimal getTimProcurador() {
        return this.getVo().asBigDecimal("TIMPROCURADOR");
   }

   public void setTimProcurador(BigDecimal timProcurador) {
        markAsChanged("TIMPROCURADOR", timProcurador);
   }

   public BigDecimal getTimProfissao() {
        return this.getVo().asBigDecimal("TIMPROFISSAO");
   }

   public void setTimProfissao(BigDecimal timProfissao) {
        markAsChanged("TIMPROFISSAO", timProfissao);
   }

   public String getTimRepresentante() {
        return this.getVo().asString("TIMREPRESENTANTE");
   }

   public void setTimRepresentante(String timRepresentante) {
        markAsChanged("TIMREPRESENTANTE", timRepresentante);
   }

   public String getTimRg() {
        return this.getVo().asString("TIMRG");
   }

   public void setTimRg(String timRg) {
        markAsChanged("TIMRG", timRg);
   }

   public BigDecimal getTimTipo() {
        return this.getVo().asBigDecimal("TIMTIPO");
   }

   public void setTimTipo(BigDecimal timTipo) {
        markAsChanged("TIMTIPO", timTipo);
   }

   public String getEnviaNotifCota() {
        return this.getVo().asString("ENVIANOTIFCOTA");
   }

   public void setEnviaNotifCota(String enviaNotifCota) {
        markAsChanged("ENVIANOTIFCOTA", enviaNotifCota);
   }

   public BigDecimal getCodUsuAlt() {
        return this.getVo().asBigDecimal("CODUSUALT");
   }

   public void setCodUsuAlt(BigDecimal codUsuAlt) {
        markAsChanged("CODUSUALT", codUsuAlt);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
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
        this.setVo(vo);
        return this;
   }
}
